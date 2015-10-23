/**
 * Created by azheng on 10/23/2015.
 */
angular.module('app').controller('ServiceController', function ($scope, $timeout, GithubService) {
    var timeout;
    $scope.$watch('username', function (newUsername) {
        if (timeout) $timeout.cancel(timeout);
        timeout = $timeout(function () {
            GithubService.events(newUsername)
                .success(function(data, status, headers) {
                    $scope.events = data.data;
                });
        }, 350);

    })
})