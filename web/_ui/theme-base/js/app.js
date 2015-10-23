/**
 * Created by azheng on 10/22/2015.
 */
angular.module('app', ['ngRoute', 'app.services']);
angular.module('app.services', []);
angular.module('app.directives', []);
angular.module('app.filters', []);

angular.module('app').
    config(['$routeProvider', function($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '../view/home.html',
                controller: 'HomeController'
            })
            .when('/login', {
                templateUrl: '../view/login.html',
                controller: 'LoginController'
            })
            .otherwise({
                redirectTo: '/'
            })
    }]);
