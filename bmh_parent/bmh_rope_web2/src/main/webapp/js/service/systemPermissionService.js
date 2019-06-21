//服务层
app.service('systemPermissionService',function($http){


	this.updateStatus=function(status,systemPermissionId){
		return $http.get('../../systemPermission/updateStatus/'+status+"/"+systemPermissionId);
	}
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../../systemPermission/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../../systemPermission/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../../systemPermission/findOne/'+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../../systemPermission/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../../systemPermission/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../../systemPermission/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../../systemPermission/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
