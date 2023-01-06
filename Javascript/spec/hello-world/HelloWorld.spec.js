const HelloWorld = require("../../src/HelloWorld");

describe('HelloWorldSpec', () => {
   describe('#greet', () => {
      it('returns the classic hello world', () => {
         const expectedGreet = 'Hello, world!';

         expect(new HelloWorld().greet()).toBeSameAs(expectedGreet);
      });
   });
});
