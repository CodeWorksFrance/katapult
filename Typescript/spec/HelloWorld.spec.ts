const Greeter = require("../src/HelloWorld.ts")
const greeter = new Greeter();

describe("The hello world spec", () => {

    it("should be 4", () => {
        expect(2 + 2).toEqual(4)
    });

    it("same using import", () => {
        expect(greeter.greet()).toEqual("Hello, world!");
    });
});
