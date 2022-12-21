import {render,waitFor,screen} from "@testing-library/react";
import Todos from "./Todos";
import axios from 'axios';

jest.mock("axios");
const dummyTodos=[
    {
        userId:1,
        id:1,
        title:"todos 1",
        completed:false,
    },
    {
        userId:1,
        id:2,
        title:"todos 2",
        completed:false,
    }, {
        userId:1,
        id:3,
        title:"todos 3",
        completed:false,
    }
];

test("todos list",async()=>{
    axios.get.mockResolvedValue({data:dummyTodos});
    render(<Todos />);
    const todoList=await waitFor(()=>screen.findAllByTestId("todo"));
    expect(todoList).toHaveLength(3);
})