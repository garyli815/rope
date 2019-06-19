//服务层
app.service('systemUserService',function($http){


	this.updateStatus=function(status,systemUserId){
		return $http.get('../../systemUser/updateStatus/'+status+"/"+systemUserId);
	}
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../../systemUser/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../../systemUser/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../../systemUser/findOne/'+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../../systemUser/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../../systemUser/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../../systemUser/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../../systemUser/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
