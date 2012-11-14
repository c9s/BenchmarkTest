var http = require('http');
var server = http.createServer(function (request, response) {
  response.writeHead(200, {'Content-Type': 'text/plain'});
  response.end('Hello World\n');
});
server.on('connection',function(s) { 
    s.setNoDelay();
});
server.listen(5000);
