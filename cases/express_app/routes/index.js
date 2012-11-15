
/*
 * GET home page.
 */

exports.index = function(req, res){
  res.write('Hello World');
  res.end();
  // res.render('index', { title: 'Express' });
};
