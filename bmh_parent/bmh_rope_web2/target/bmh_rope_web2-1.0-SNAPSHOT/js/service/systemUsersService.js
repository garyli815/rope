//服务层
app.service('systemUsersService',function($http){


	this.updateStatus=function(status,systemUsersId){
		return $http.get('../../systemUsers/updateStatus/'+status+"/"+systemUsersId);
	}
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../../systemUsers/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../../systemUsers/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../../systemUsers/findOne/'+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../../systemUsers/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../../systemUsers/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../../systemUsers/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../../systemUsers/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
