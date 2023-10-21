import React from 'react'

const Content = () => {
  const handleNameChange = () => {
    const names = ['Bob', 'Kevin', 'Dave'];
    const int = Math.floor(Math.random() * 3);

    return names[int];
  }

  const handleClick = () => {
	console.log("You Clicked")
  }

  const handleClickWithParam = (name) => {
	console.log(`${name} clicked me`)
  }

  return (
	<main>
		<p>Hello {handleNameChange()}!</p>
		<button onClick={handleClick}>
			Randomize
		</button>
		<button onClick={() => handleClickWithParam(handleNameChange())}>
			Randomize2
		</button>
	</main>
  )
}

export default Content