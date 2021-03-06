<?php
require 'Universal/ClassLoader/BasePathClassLoader.php';
$loader = new \Universal\ClassLoader\BasePathClassLoader( array('../src','../vendor/pear'));
$loader->useIncludePath(true);
$loader->register();


use Roller\Plugin\RESTful\ResourceHandler;
use Roller\Plugin\RESTful\GenericHandler;

class MyGenericHandler extends GenericHandler
{

    public function create($resource) { 
        return array( 'id' => 99 );
    }

    public function load($resource,$id) { 
        return array( 'id' => $id );
    }

    public function update($resource,$id) { 
        $put = $this->parseInput();
        return $put;
        // return array( 'id' => $id );
    }

    public function delete($resource,$id) { 
        $args = $this->parseInput();
        // print_r($args);
        return array( 'id' => $id );
    }

    public function find($resource) { 
        return range(1,10);
    }

}

$router = new Roller\Router( null, array( 
    'cache_id' => 'router_demo',
    'apc' => true,
));

$restful = new Roller\Plugin\RESTful(array( 'prefix' => '/=' ));
$restful->setGenericHandler( 'MyGenericHandler' );
$router->addPlugin($restful);

$router->add('/',function() { 
    return 'Hello World, please request /=/test for RESTful resource handler demo.';
});

$r = $router->dispatch( isset($_SERVER['PATH_INFO']) ? $_SERVER['PATH_INFO'] : '/' );
if( $r )
    echo $r();
else
    die('Page not found');
