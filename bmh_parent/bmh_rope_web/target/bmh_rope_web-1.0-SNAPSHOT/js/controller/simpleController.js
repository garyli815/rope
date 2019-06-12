// 和html交互
app.controller("simpleController",function ($scope,$controller,uploadService) {


    //上传文件
    $scope.uploadFile=function () {
        uploadService.uploadFile().success(function (response) {
            if(response.success){
                $scope.entity.url = response.message;
            }
        })
    }
})