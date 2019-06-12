// 原则：只和后台controller交互 不要出现$scope
app.service("historyHoldsService",function ($http) {

    //查询分页数据
    this.findPage=function (pageNum,pageSize) {
        return $http.get("../../holds/findPage?pageNum="+pageNum+"&pageSize="+pageSize);
    }

//查询所有
    this.findAll=function () {
        return $http.get("../../holds/findAll");
    }

    this.add=function (entity) {
        return $http.post("../../holds/add",entity);
    }

    this.update=function (entity) {
        return $http.post("../../holds/update",entity);
    }

// 根据id查询对象
    this.findOne=function (id) {
        return $http.get("../../holds/findOne?id="+id);
    }

    this.dele=function (ids) {
        return $http.get("../../holds/dele?ids="+ids);
    }

    this.search=function (pageNum,pageSize,searchEntity) {
        return $http.post("../../holds/search?pageNum="+pageNum+"&pageSize="+pageSize,searchEntity);
    }

    this.searchByParamMap=function (paramMap) {
        return $http.post("../../holds/searchByParamMap",paramMap);
    }
})

