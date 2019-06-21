//控制层 
app.controller('systemUsersController',function($scope, $controller, systemUsersService) {

			$controller('baseController', {$scope : $scope});// 继承


			$scope.updateStatus=function(status,info){

				var flag = window.confirm("确认要"+info+"此商家吗？");
				if(flag){
					systemUsersService.updateStatus(status,$scope.entity.clientId).success(function(response){
						if(response.success){
							$scope.reloadList();
						}else{
							alert(response.message);
						}
					})
				}


			}
			// 读取列表数据绑定到表单中
			$scope.findAll = function() {
				systemUsersService.findAll().success(function(response) {
					$scope.list = response;
				});
			}

			// 分页
			$scope.findPage = function(page, rows) {
				systemUsersService.findPage(page, rows).success(function(response) {
					$scope.list = response.rows;
					$scope.paginationConf.totalItems = response.total;// 更新总记录数
				});
			}

			// 查询实体
			$scope.findOne = function(id) {
				systemUsersService.findOne(id).success(function(response) {
					$scope.entity = response;

				});
			}

			// 保存
			$scope.save = function() {

				systemUsersService.add($scope.entity).success(function(response) {
					if (response.success) {

						alert(response.message);
					} else {
						alert(response.message);
					}
				});
			}

			// 批量删除
			$scope.dele = function() {
				// 获取选中的复选框
				systemUsersService.dele($scope.selectIds).success(
						function(response) {
							if (response.success) {
								$scope.reloadList();// 刷新列表
								$scope.selectIds = [];
							}
						});
			}

			$scope.searchEntity = {};// 定义搜索对象

			// 搜索
			$scope.search = function(page, rows) {
				systemUsersService.search(page, rows, $scope.searchEntity).success(
						function(response) {
							$scope.list = response.rows;
							$scope.paginationConf.totalItems = response.total;// 更新总记录数
						});
			};



});
