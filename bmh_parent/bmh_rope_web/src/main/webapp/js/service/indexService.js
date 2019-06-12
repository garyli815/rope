// 原则：只和后台controller交互 不要出现$scope
app.service("indexService",function ($http) {
    this.showName=function(){
        return $http.get("./index/showName");
    }

})

