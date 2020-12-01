$(document).ready( function() {
    $('#btnLoad2').click( function() {
        $.getJSON('ajax-stuinfo.json', function(jsonData) {
            var tagList = "";
            $.each(jsonData.stuinfo, function() {
                tagList += "<li>" + this.schoolyear + "</li>";
            });
            $('#listArea').empty();
            $('#listArea').append(tagList);
            $('#listArea').listview('refresh');
        });
    });
});

// JSON(JavaScript Object Notation)
// 데이터 교환을 위한 형식으로 '미니 XML'이라 불리움
// 사람이 직관적으로 이해하기 쉽고 파싱하고 생성하기도 쉬움
// 대부분의 언어에서 JSON을 사용할 수 있고 XML보다 가볍고 빨라 효율적
// JSON 명세 방법
// 자바스크립트에서 객체를 표현하는 방법과 비슷