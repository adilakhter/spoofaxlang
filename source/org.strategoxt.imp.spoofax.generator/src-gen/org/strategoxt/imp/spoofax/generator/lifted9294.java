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

@SuppressWarnings("all") final class lifted9294 extends Strategy 
{ 
  TermReference r_4541;

  TermReference j_4276;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28755:
    { 
      IStrategoTerm z_4685 = null;
      IStrategoTerm a_4686 = null;
      IStrategoTerm c_4686 = null;
      IStrategoTerm d_4686 = null;
      c_4686 = term;
      if(r_4541.value == null)
        break Fail28755;
      z_4685 = r_4541.value;
      term = c_4686;
      d_4686 = c_4686;
      if(j_4276.value == null)
        break Fail28755;
      a_4686 = j_4276.value;
      term = termFactory.makeTuple(d_4686, a_4686);
      term = collect_ast_changes_in_list_match_header_0_1.instance.invoke(context, term, z_4685);
      if(term == null)
        break Fail28755;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
      if(true)
        return term;
    }
    return null;
  }
}