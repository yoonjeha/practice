$(document).ready(function() {
    $('#btnLoad1').click( function() {
        $.ajax({
            url:'ajax-stuinfo.xml',
            type: 'get',
            dataType: 'xml',
            timeout: 10000,
            success: function(xmlData) {
                var tagList="";
                $(xmlData).find('student').each(function(){
                tagList += "<li>" + $(this).find('gradepoint').text() + "</li>";
                });
                $('#listArea').empty(); // 리스트뷰를 비움
                $('#listArea').append(tagList);
                // 리스트뷰에 tagList에 저장된 부분 리스트를 추가
                $('#listArea').listview('refresh'); // 리스트뷰를 새로 고침
            },
            error: function() {
                $("#listArea").html("<p>Error!!!</p>");
            }
        });
    });
});