import React, { useState } from 'react';
const ReactForms = () => {
    const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
    return (
        <div>
            <h2>React Forms</h2>
            <form>
      <input
        type="text"
        name="firstName"
        value={firstName}
        onChange={e => setFirstName(e.target.value)}
        placeholder="First name"
        required
      />
      <input
        value={lastName}
        onChange={e => setLastName(e.target.value)}
        placeholder="Last name"
        type="text"
        name="lastName"
        required
      />
      <input
        value={email}
        onChange={e => setEmail(e.target.value)}
        placeholder="Email address"
        type="email"
        name="email"
        required
      />
      <input
        value={password}
        onChange={e => setPassword(e.target.value)}
        placeholder="Password"
        type="password"
        name="password"
        required
      />
      <button type="submit">Submit</button>
    </form>
        </div>
    );
};
export default ReactForms;