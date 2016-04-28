<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业即时通讯系统</title>
<link href="/layim/css/layim.css" type="text/css" rel="stylesheet"/>
</head>
<body>
 <h1>即时通讯系统</h1>

<script type="text/javascript" src="/static/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/static/js/socket.io.js"></script>
<script src="/layim/lay/lib.js"></script>
<script src="/layim/lay/layer/layer.min.js"></script>
<script src="/layim/lay/layim.js"></script>
<script type="text/javascript">

var socket = io.connect('http://localhost:9092');

socket.on('chatevent', function(data) {
    output('<span class="username-msg">' + data.userName + ' : </span>'
            + data.message);
});

function sendMessage() {
    var userName = $("#name").val()
    var message = $('#msg').val();
    $('#msg').val('');
    socket.emit('chatevent', {
        userName : userName,
        message : message
    });
}

function output(message) {
    var currentTime = "<span class='time' >" + new Date() + "</span>";
    var element = $("<div>" + currentTime + " " + message + "</div>");
    $('#console').prepend(element);
}
</script>

</body>
</html>