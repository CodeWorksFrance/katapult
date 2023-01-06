beforeEach(function () {
  jasmine.addMatchers({
    toBeSameAs: function () {
      return {
        compare: function (actual, expected) {

          return {
            pass: actual === expected
          };
        }
      };
    }
  });
});
