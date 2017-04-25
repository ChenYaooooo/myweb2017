/**
 * Created by Yao on 8/4/2017.
 */
angular.module('myApp',[])
    .controller('mainController',['$scope',function($scope){
        $scope.click = function(){
            console.log("click..");
        }
    }])
