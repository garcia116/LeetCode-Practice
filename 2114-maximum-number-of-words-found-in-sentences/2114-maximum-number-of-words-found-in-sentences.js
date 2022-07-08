/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    var max = 0
    sentences.forEach(sentence => {
        max = Math.max(max, sentence.split(" ").length)
    })
    return max
};