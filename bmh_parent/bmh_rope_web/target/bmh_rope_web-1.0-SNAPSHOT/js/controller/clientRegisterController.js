app.controller("clientRegisterController",function($scope,clientService){
	
	$scope.save=function(){
		clientService.add($scope.entity).success(function(response){
			if(response.success){
				alert("5个工作日之内会完成审核！！！");
			}else{
				alert(response.message);
			}
			
			
		})
	}
	
	
})