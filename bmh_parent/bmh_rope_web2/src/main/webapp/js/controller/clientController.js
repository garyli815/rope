//控制层 
app.controller('clientController',function($scope, $controller, clientService) {

			$controller('baseController', {$scope : $scope});// 继承


			$scope.updateStatus=function(status,info){

				var flag = window.confirm("确认要"+info+"此商家吗？");
				if(flag){
					clientService.updateStatus(status,$scope.entity.clientId).success(function(response){
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
				clientService.findAll().success(function(response) {
					$scope.list = response;
				});
			}

			// 分页
			$scope.findPage = function(page, rows) {
				clientService.findPage(page, rows).success(function(response) {
					$scope.list = response.rows;
					$scope.paginationConf.totalItems = response.total;// 更新总记录数
				});
			}

			// 查询实体
			$scope.findOne = function(id) {
				clientService.findOne(id).success(function(response) {
					$scope.entity = response;
				});
			}

			// 保存
			$scope.save = function() {
				//商家注册
				clientService.add($scope.entity).success(function(response) {
					if (response.success) {
						// 跳转到商品登录页面
						location.href = "shoplogin.html";
					} else {
						alert(response.message);
					}
				});
			}

			// 批量删除
			$scope.dele = function() {
				// 获取选中的复选框
				clientService.dele($scope.selectIds).success(
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
				clientService.search(page, rows, $scope.searchEntity).success(
						function(response) {
							$scope.list = response.rows;
							$scope.paginationConf.totalItems = response.total;// 更新总记录数
						});
			};

		});
