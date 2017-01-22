var RAASCMSURL = "restexample";
var baseURL = RAASCMSURL + "?servicehandler=restexample&request=";

var startRestRequest;

var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.trafoResult = {javaText:'(empty)',csharpText:'(empty)',xpathText:'(empty)'};
    $scope.classNames = ["Select package first.."];
    $scope.packageURIs = ["Loading package URIs from server.."];
    $scope.ngtranslateOCL = function() {
    	translateOCL($scope);
    }
});

$(function () {

	performRESTRequest(
			"GetAllPackagesRequest",
			function(data) {
				$scope=$('#appId').scope();
				$scope.packageURIs = data.packageURIs;
				$scope.$digest();
			}
	);	
			
	$('#packageDropDown').change(loadClassesForPackage);		
		
});


function loadClassesForPackage(doAfterLoaded) {

		performRESTRequest(
				"GetAllClassesRequest&packageURI=" + $("#packageDropDown option:selected").text(),
				function(data) {
					$scope=$('#appId').scope();
					$scope.classNames = data.classNames;
					$scope.$digest();
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

function translateOCL($scope) {
	
		performRESTRequest(
				"TransformOCLRequest&packageURI=" + $("#packageDropDown option:selected").text()+"&className=" + $("#classDropDown option:selected").text()+"&oclText=" + $("#ocl_text").val(),
				function(data) {  
					$scope.trafoResult = data;
					$scope.$digest();
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
