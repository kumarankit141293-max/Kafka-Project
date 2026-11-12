#!/bin/bash

echo "Switching to main branch..."
git checkout main

echo "Merging release branch..."
git merge release

TAG_NAME="release-$(date +%Y%m%d-%H%M%S)"

echo "Creating tag $TAG_NAME"
git tag $TAG_NAME

echo "Pushing main branch..."
git push origin main

echo "Pushing tag..."
git push origin $TAG_NAME

echo "Done!"