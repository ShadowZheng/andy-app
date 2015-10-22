/**
 * Created by azheng on 10/22/2015.
 */
angular.module('app',['ngRoute']).
    config(['$routeProvider', function($routeProvider) {
        var baseUrl = 'WEB-INF/view';
        $routeProvider
            .when('/', {
                templateUrl: baseUrl + '/home.html',
                controller: 'HomeController'
            })
            .when('/login', {
                templateUrl: baseUrl + '/home.html',
                controller: 'HomeController'
            })
            .otherwise({
                redirectTo: '/'
            })
    }]);