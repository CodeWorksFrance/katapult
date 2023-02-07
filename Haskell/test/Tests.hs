module Main where

import Test.Hspec
import Test.QuickCheck

import App

main = hspec $ do
    describe "Greeting the world" $ do
       it "Says hello" $
            greet `shouldBe` "Hello, world !"
    describe "Altering the greeting (to show off property-based testing)" $ do
        it "Preserves the length of a greeting" $
            property (\greeting -> length greeting == length (alter greeting))
