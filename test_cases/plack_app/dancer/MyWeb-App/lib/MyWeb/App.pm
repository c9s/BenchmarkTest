package MyWeb::App;
use Dancer ':syntax';

our $VERSION = '0.1';

get '/' => sub {
# template 'index';
    return 'Hello world';
};

true;
