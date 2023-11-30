/*Question
Complétez le code source ci-contre pour que la fonction focus donne le focus au champ <input>
quand le bouton est cliqué
 */


import React ,{useRef} from 'react';

// Fix the code below
function InputWithFocusButton() {
    const inputEl = useRef(null);
    const onButtonClick = () =>{
        inputEl.current.focus();
        };
    return (<div>
                 <input ref={inputEl} type='text' />
                 <button onClick = {onButtonClick}>Focus input field</button>
               </div>);
     }
// Modify this function if you want to change the preview
// It will not be evaluated as part of the assessment
export function Preview() {
      return <InputWithFocusButton />;
     }

// Do not change
export default InputWithFocusButton;