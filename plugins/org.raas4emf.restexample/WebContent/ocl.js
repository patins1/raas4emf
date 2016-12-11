var RAASCMSURL = "restexample";
var baseURL = RAASCMSURL + "?servicehandler=restexample&request=";

var startRestRequest;

$(function () {

	performRESTRequest(
			"GetAllPackagesRequest",
			function(data) {
				var $select = $('#packageDropDown'); 
				$select.find('option').remove();  
				$.each(data.packageURIs,function(key, value) 
				{					
				    $select.append('<option value="' + value + '">' + value + '</option>');
				});
			}
	);	
			
	$('#packageDropDown').change(loadClassesForPackage);		
		
});


function loadClassesForPackage(doAfterLoaded) {

		performRESTRequest(
				"GetAllClassesRequest&packageURI=" + $("#packageDropDown option:selected").text(),
				function(data) {
					var $select = $('#classDropDown'); 
					$select.find('option').remove();  
					$.each(data.classNames,function(key, value) 
					{					
					    $select.append('<option value="' + value + '">' + value + '</option>');
					});	
					if (typeof  doAfterLoaded == "function") doAfterLoaded();
				}
		);

}


function loadConstraint(package,clazz,ocl) {
	 $("#packageDropDown").val(package);
	 loadClassesForPackage(function () {
		 $("#classDropDown").val(clazz);
		 $("#ocl_text").val(ocl);
	});
}

function loadMoodCodeConstraint() {
	loadConstraint("urn:hl7-org:v3","StructuredBody","(not self.moodCode.oclIsUndefined()) implies self.moodCode=vocab::ActMood::EVN");
}

function loadVisibilityConstraint() {
	loadConstraint("http://www.eclipse.org/uml2/3.0.0/UML","ElementImport","self.visibility  = VisibilityKind::public or self.visibility  = VisibilityKind::private");
}

function loadPolyloopConstraint() {
	loadConstraint("http://IFC2X3.ecore","IfcPolyLoop","self.Polygon->first().Coordinates = self.Polygon->last().Coordinates");
}

function translateOCL() {
	
		performRESTRequest(
				"TransformOCLRequest&packageURI=" + $("#packageDropDown option:selected").text()+"&className=" + $("#classDropDown option:selected").text()+"&oclText=" + $("#ocl_text").val(),
				function(data) {  
					$('#java_text').html(data.javaText);
					$('#csharp_text').html(data.csharpText);
					$('#xpath_text').html(data.xpathText);	
				}
		);
		
}


function updateStatus(data) {
	if (data.errorMessage) {
		$("#status").html("Error message from server: " + data.errorMessage);
		$("#status").css('color', 'red');
		return false;
	} else {
		$("#status").html(
				"Request processed in "
						+ (new Date().getTime() - startRestRequest) + "ms");
		$("#status").css('color', 'green');
		return true;
	}
}

function performRESTRequest(urlSuffix, success) {
	
	var url = baseURL + urlSuffix;
	
	startRestRequest = new Date().getTime();

	$("#status").html("Waiting for response...");
	$("#status").css('color', 'gray');

	$.getJSON(url + "&token=" + $("#token").val()).done(
			function(data) {
				if (updateStatus(data) && success)
					success(data);
			}).fail(function( jqXHR, textStatus, errorThrown) {
		$("#status").html("Server request failed: "+jqXHR.status+ " " + jqXHR.statusText +(jqXHR.responseJSON?': '+jqXHR.responseJSON.errorMessage:'') );
		$("#status").css('color', 'red');
	});
}
