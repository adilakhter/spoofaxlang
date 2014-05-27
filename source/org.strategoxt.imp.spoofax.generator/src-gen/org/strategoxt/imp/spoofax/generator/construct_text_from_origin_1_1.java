package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class construct_text_from_origin_1_1 extends Strategy 
{ 
  public static construct_text_from_origin_1_1 instance = new construct_text_from_origin_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4270, IStrategoTerm z_4269)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("construct_text_from_origin_1_1");
    Fail25852:
    { 
      IStrategoTerm a_4270 = null;
      IStrategoTerm b_4270 = null;
      b_4270 = term;
      term = support_sublist_1_0.instance.invoke(context, b_4270, lifted9272.instance);
      if(term == null)
        break Fail25852;
      a_4270 = term;
      term = termFactory.makeTuple(b_4270, term);
      IStrategoTerm term10285 = term;
      Success10224:
      { 
        Fail25853:
        { 
          term = same_signature_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25853;
          if(true)
            break Success10224;
        }
        term = unmodified_list_0_0.instance.invoke(context, term10285);
        if(term == null)
          break Fail25852;
      }
      term = termFactory.makeTuple(a_4270, b_4270);
      term = construct_text_by_compare_1_1.instance.invoke(context, term, d_4270, z_4269);
      if(term == null)
        break Fail25852;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}