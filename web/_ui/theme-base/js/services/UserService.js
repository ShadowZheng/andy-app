/**
 * Created by Administrator on 2015/10/22 0022.
 */
app.factory('UserService', ['$resource', function($resource) {
    return $resource('/get')
}])