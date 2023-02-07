module Main where

import App

main :: IO ()
main = do
    putStrLn greet
    putStrLn $ alter greet
