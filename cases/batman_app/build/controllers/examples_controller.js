(function() {
  var __hasProp = {}.hasOwnProperty,
    __extends = function(child, parent) { for (var key in parent) { if (__hasProp.call(parent, key)) child[key] = parent[key]; } function ctor() { this.constructor = child; } ctor.prototype = parent.prototype; child.prototype = new ctor(); child.__super__ = parent.prototype; return child; };

  App.ExamplesController = (function(_super) {

    __extends(ExamplesController, _super);

    function ExamplesController() {
      return ExamplesController.__super__.constructor.apply(this, arguments);
    }

    ExamplesController.prototype.routingKey = 'examples';

    ExamplesController.prototype.index = function() {};

    return ExamplesController;

  })(App.ApplicationController);

}).call(this);
