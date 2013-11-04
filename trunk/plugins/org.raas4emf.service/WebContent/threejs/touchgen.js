
        // Global variables to hold width and height values
		var w = 0;
        var h = 0;

		// this holds all the touch events currently being tracked
		var g_cursors = new Array();
		
		// Web socket connection variables
		var g_webSocket;
		var g_websocket_host;
		var g_websocket_port;

		// When the page loads execute this code
//		$(document).ready(function () 
//		{
			loadEvent();
//      });
		
		//----------------------------------------------------------------
		// EXECUTION STARTS HERE:
		// loadEvent is where execution begins when the document is loaded
		//----------------------------------------------------------------
		function loadEvent()
		{
		   g_websocket_host = "localhost";
		   g_websocket_port = "3334";
		   
		    // divorce from the body load event
			g_socket_interval = setInterval(socketCheck, 1000);
			//setInterval(update, 10);
//			setInterval(clear, 5000);
		}
		
		// this is the object type held in the g_cursors array
		function Cursor( id, ix, iy )
		{
			this.myX = ix;
			this.myY = iy;
			this.myId = id;
			this.render();
			this.createdUTC = Number(new Date());
			this.updatedUTC = null;
			this.aliveFor = 0;
		}

		Cursor.prototype.render = function()
		{
//			this.pageX = Math.round(screen.width * this.myX) - window.screenX;
//          this.pageY = Math.round(screen.height * this.myY) - window.screenY-(window.outerHeight-window.innerHeight);
			this.pageX = Math.round(screen.width * this.myX) - window.screenX;
			this.pageY = Math.round(screen.height * this.myY) - window.screenY;
//			this.pageX = Math.round(window.innerWidth * this.myX);
//            this.pageY = Math.round(window.innerHeight * this.myY);
			//myLog("pageX="+this.pageX+" pageY="+this.pageY);
			this.target = document.elementFromPoint( this.pageX, this.pageY);
			if (this.target instanceof HTMLIFrameElement) {
				var offLeft = 0;
				var offTop = 0;
				var p = this.target;
				while (p) {
					offLeft += p.offsetLeft;
					offTop += p.offsetTop;					
					p = p.offsetParent;
				}
				this.pageX -= offLeft;
				this.pageY -= offTop;
				this.target = this.target.contentWindow.document.elementFromPoint(this.pageX, this.pageY);
			}
		}
		
		function dispatchAsTouchEvent(type,changedId,remove) {

			   var touch = null;
			   var touches = [];
			   for ( var i = 0; i < g_cursors.length; ++i )
			   {
				   var cursor = g_cursors[i];
				   if (!cursor.target) {
					   continue;
				   }
				   var t = {"screenX":cursor.pageX,"screenY":cursor.pageY,"clientX":cursor.pageX,"clientY":cursor.pageY,"pageX":cursor.pageX,"pageY":cursor.pageY,"view":cursor.target.ownerDocument.defaultView,"target":cursor.target,"identifier":cursor.myId};
				   if (t.identifier==changedId) {
					   touch = t;
					   if (remove) continue;
				   }
				   touches.push(t);
			   }
			   if (!touch) return;			   
			   var target = touch.target;
			   
//			   if (type == "touchstart") console.log("touchstart for "+target.id+"/"+target.name+"/"+target.tagName+"/"+target.classname+"/"+target+" at url "+window.location.href +" at pageX="+touch.pageX+" and pageY="+touch.pageY);

			   var evt = window.document.createEvent('CustomEvent');

			   //myLogHTML( type+", id= "+touch.identifier+" x="+touch.screenX+" y="+touch.screenY+" target="+target.id);	
			   //g_pickInfoElem.innerHTML = type+", id= "+touch.identifier+" x="+touch.screenX+" y="+touch.screenY+" target="+target;	
			   evt.initEvent(type, true, true);
			   evt.touches=touches;
			   evt.changedTouches= touch ? [touch] : [];
			   evt.targetTouches=[];
			   evt.detail=1;
			   evt.button=0;
			   for (var tt=0; tt<touches.length; tt++)
				   if (touches[tt].target==target)
					   evt.targetTouches.push(touches[tt]);		   
			   target.dispatchEvent(evt);
			   
		}

		function dispatchAsMouseEvent(type,changedId,remove) {
			
			   var touch = null;
			   var touches = [];
			   for ( var i = 0; i < g_cursors.length; ++i )
			   {
				   var cursor = g_cursors[i];
				   if (!cursor.target) {
					   continue;
				   }
				   var t = {"screenX":cursor.pageX,"screenY":cursor.pageY,"clientX":cursor.pageX,"clientY":cursor.pageY,"pageX":cursor.pageX,"pageY":cursor.pageY,"view":cursor.target.ownerDocument.defaultView,"target":cursor.target,"identifier":cursor.myId};
				   if (t.identifier==changedId) {
					   touch = t;
					   if (remove) continue;
				   }
				   touches.push(t);
			   }
			   if (!touch) return;			   
			   var target = touch.target;

			   var evt = document.createEvent("MouseEvents");
			   evt.initMouseEvent(type, true, true, touch.view, 1,
						touch.screenX, touch.screenY, touch.clientX, touch.clientY,
					false, false, false, false, 0, null);
			   target.dispatchEvent(evt);

			   
		}
		
		//----------------------------------------------------------------
		// When data comes in over the WebSocket, it gets parsed and these
		// callbacks are invoked depending on the contents of the data.
		//----------------------------------------------------------------
		function touchAdd(id, x, y)
		{
		   g_cursors.push( new Cursor(id,x,y) );		   
		   if (g_cursors.length>=2) dispatchAsTouchEvent("touchstart",id);
		   if (g_cursors.length==1) dispatchAsMouseEvent("mousedown",id);
		}
		
		
		function touchUpdate(id, x, y)
		{
		   var timestamp = Number(new Date());
		   for ( var i = 0; i < g_cursors.length; ++i )
		   {
			  if ( g_cursors[i].myId == id )
			  {
				 g_cursors[i].myX = x;
				 g_cursors[i].myY = y;
				 g_cursors[i].render();
				 g_cursors[i].updatedUTC = timestamp;
				 g_cursors[i].aliveFor = eval(g_cursors[i].updatedUTC - g_cursors[i].createdUTC);
			  }
		   }
		   if (g_cursors.length>=2) dispatchAsTouchEvent("touchmove",id);
		   if (g_cursors.length==1) dispatchAsMouseEvent("mousemove",id);
		}

		function touchRemove(id)
		{
		   if (g_cursors.length>=2) dispatchAsTouchEvent("touchend",id);
		   if (g_cursors.length==1) dispatchAsMouseEvent("mouseup",id);
		   if (g_cursors.length==1) dispatchAsMouseEvent("click",id,true);
		   var freshCursors = new Array();
		   for ( var i = 0; i < g_cursors.length; ++i )
		   {
			  if ( g_cursors[i].myId != id )
			  {
				 freshCursors.push( g_cursors[i] );
			  }
		   }
		   g_cursors = null;
		   g_cursors = freshCursors;
		}

		//----------------------------------------------------------------
		// Check the status of the WebSocket. If the socket is not connected
		// and the app has focus, connect the web socket. This function is
		// on a one second timer, set up earlier in main()
		//----------------------------------------------------------------
		function socketCheck()
		{
		   if ((g_webSocket == null ))
		   {
			  var wsloc = "ws://" + g_websocket_host + ":" + g_websocket_port;
			  g_webSocket = new WebSocket(wsloc);

			  g_webSocket.onopen = sockopen;
			  g_webSocket.onclose = sockclose;
			  g_webSocket.onmessage = sockmsg;
			  g_webSocket.onerror = sockerr;
		   }
		}

		function sockopen(evt)
		{
		   console.log("Web socket connected.");
		}

		function sockclose(evt)
		{
		   //console.log("Web socket disconnected.");
		   g_webSocket = null;
		}

		function sockerr(evt)
		{
		   //console.log("Web socket error, killing connection.");
		   g_webSocket = null;
		}

		function sockmsg(evt)
		{
		   // incoming message is ID,OPERATION,X,Y
		   // where operation is A,R,U  for add,remove,update
		   var xyarr = evt.data.split(",");
		   
		   var id = xyarr[0];
		   var op = xyarr[1];

		   var x = parseFloat(xyarr[2]);
		   var y = parseFloat(xyarr[3]);

			if ( op == "A" )
			  touchAdd(id, x, y);
			else if ( op == "R" )
			  touchRemove(id);
			else if ( op == "U" )
			  touchUpdate(id, x, y);
		}
        