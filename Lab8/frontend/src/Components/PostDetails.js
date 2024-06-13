import axios from "../Config/api";
import Comment from "./Comment";
import {useContext} from "react";
import {PostContext} from "../Pages/Dashboard";

const PostDetails = ({posts, reloadPostsHandler}) => {

    const {postID} = useContext(PostContext);

    const postDetails = posts.find(post => post.id === postID);

    if (!postDetails) {
        return null;
    }

    const deletePost = postID => {
        axios.delete(`posts/${postID}`)
            .then(r => {
                console.log(r.data)
                reloadPostsHandler();
            }).catch(err => console.log(err))
    }

    return <div className={`col-12`}>
        <h5 className={`py-3 text-end`}>Post details</h5>
        <div className={`post-details`}>
            <div className={`card p-3`}>
                <div>ID: {postDetails.id}</div>
                <h4>Title: {postDetails.title}</h4>
                <p>Content: {postDetails.content}</p>
                <small>Author: {postDetails.author}</small>
                <div className={`text-end`}>
                    <i className="fa fa-trash-o float-end"
                       onClick={() => deletePost(postDetails.id)}
                       title={`Delete post`}/>
                </div>
            </div>
            <Comment />
        </div>
    </div>
}

export default PostDetails;