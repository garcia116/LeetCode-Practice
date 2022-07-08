/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    var max = 0
  //  sentences.forEach(sentence => {
 //       max = Math.max(max, sentence.split(" ").length)
 //   })
    for(let i of sentences){
        max = Math.max(max, i.split(" ").length)
    }
    
    return max
};