//服务层
app.service('systemRoleService',function($http){


	this.updateStatus=function(status,systemRoleId){
		return $http.get('../../systemRole/updateStatus/'+status+"/"+systemRoleId);
	}
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../../systemRole/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../../systemRole/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../../systemRole/findOne/'+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../../systemRole/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../../systemRole/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../../systemRole/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../../systemRole/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
