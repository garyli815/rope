// 原则：只和后台controller交互 不要出现$scope
app.service("ropeService",function ($http) {

    //查询分页数据
    this.findPage=function (pageNum,pageSize) {
        return $http.get("../../rope/findPage?pageNum="+pageNum+"&pageSize="+pageSize);
    }

//查询所有
    this.findAll=function () {
        return $http.get("../../rope/findAll");
    }

    this.add=function (entity) {
        return $http.post("../../rope/add",entity);
    }

    this.update=function (entity) {
        return $http.post("../../rope/update",entity);
    }

// 根据id查询对象
    this.findOne=function (id) {
        return $http.get("../../rope/findOne?id="+id);
    }

    this.dele=function (ids) {
        return $http.get("../../rope/dele?ids="+ids);
    }

    this.search=function (pageNum,pageSize,searchEntity) {
        return $http.post("../../rope/search?pageNum="+pageNum+"&pageSize="+pageSize,searchEntity);
    }
})

