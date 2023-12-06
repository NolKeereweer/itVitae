import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [myItems, setMyItems] = useState(["eat", "sleep", "warhammer", "repeat"]);
  const [newItem, setNewItem] = useState("");

  const change = event => {
    console.log(`You typed a letter -now ${event.target.value}`)
    setNewItem(event.target.value);
  }

  const submit = event => {
    event.preventDefault();
    console.log(`You submitted ${newItem}`);
    if (myItems.includes(newItem)) {
      alert(`Can't add ${newItem}, already exists`);
      return;
    }
    setMyItems([...myItems, newItem]);
    setNewItem("");
  } 

  const remove = itemToBeRemoved => 
    setMyItems(myItems.filter(item => item !== itemToBeRemoved))

  return (
    <>
      <h1>Todo list</h1>
      <ol>
        {myItems.map(item => 
          <li key={item}>{item}
            <button onClick={() => remove(item)}>
              Remove
            </button>
          </li>)}
      </ol>
      <form onSubmit={submit}>
        <input type="text" value={newItem} onChange={change}></input>
        <input type="submit"></input>
      </form>
    </>
  )
}

export default App
