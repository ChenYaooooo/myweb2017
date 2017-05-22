/**
 * Created by Yao on 8/4/2017.
 */
angular.module('myApp',['angularTrix'])
    .controller('mainController',['$scope',function($scope){
        $scope.click = function(){
            console.log("click..");
        }
    }])
