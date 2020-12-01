$(document).ready(function() {
    $('#btnLoad3').click( function() {
        $('#listArea').empty(); // 리스트뷰를 비움
        $('#listArea').load('ajax-season.html li', function(htmlData) {
            $('#listArea').listview('refresh'); // 리스트뷰를 새로 고침
        });
    });
});