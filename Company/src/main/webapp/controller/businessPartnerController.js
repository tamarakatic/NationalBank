var businessPartnerModule = angular.module('businessPartner.controller', []);

businessPartnerModule.controller('businessPartnerController', ['$scope', '$window', '$location', '$http', '$stateParams',
	function ($scope, $window, $location, $http, $stateParams) {

	  angular.element(document).ready(function() {
		    $http.get('/businessPartner/getAllBusinessPartners/'+$stateParams.companyId).then(function(response) {
		      $scope.businessPartners = response.data;
		    }, function(response) {
		      alert(response.statusText);
		    });
	  });

	  $scope.submitBusinessPartner = function () {
		    $http.post('businessPartner/create/'+$stateParams.companyId, $scope.businessPartner).then(function mySuccess(response) {
		      if(response.data == "200") {
		        toastr.success("Created!");
		      } else {
					$window.location.reload();
		      }
		    }, function myError(response) {
		      alert(response.statusText);
		    });
	  }
	
	  $scope.deleteBusinessPartner = function(id) {
		    $http.post('businessPartner/delete', id).then(function mySuccess(response) {
		      if(response.data == "200") {
		        toastr.success("Business Partner deleted!");
		      }	else {
					$window.location.reload();
				}
		    }, function myError(response) {
		      alert(response.statusText);
		    });
	  }
	}
]);
