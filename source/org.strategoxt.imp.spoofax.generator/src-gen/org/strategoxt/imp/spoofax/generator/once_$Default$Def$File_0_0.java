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

@SuppressWarnings("all") public class once_$Default$Def$File_0_0 extends Strategy 
{ 
  public static once_$Default$Def$File_0_0 instance = new once_$Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DefaultDefFile_0_0");
    Fail27760:
    { 
      IStrategoTerm v_4539 = null;
      TermReference w_4539 = new TermReference();
      TermReference x_4539 = new TermReference();
      IStrategoTerm y_4539 = null;
      IStrategoTerm z_4539 = null;
      IStrategoTerm b_4540 = null;
      IStrategoTerm c_4540 = null;
      IStrategoTerm e_4540 = null;
      IStrategoTerm f_4540 = null;
      if(w_4539.value == null)
        w_4539.value = term;
      else
        if(w_4539.value != term && !w_4539.value.match(term))
          break Fail27760;
      b_4540 = term;
      e_4540 = term;
      c_4540 = generator.const7912;
      f_4540 = e_4540;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, f_4540, c_4540, generator.constCons4561);
      if(term == null)
        break Fail27760;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27760;
      v_4539 = term.getSubterm(0);
      z_4539 = term.getSubterm(1);
      y_4539 = term.getSubterm(2);
      term = v_4539;
      lifted10272 lifted102720 = new lifted10272();
      lifted102720.w_4539 = w_4539;
      lifted102720.x_4539 = x_4539;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102720);
      if(term == null)
        break Fail27760;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27760;
      term = hashtable_put_0_2.instance.invoke(context, y_4539, z_4539, term);
      if(term == null)
        break Fail27760;
      term = b_4540;
      if(x_4539.value == null)
        break Fail27760;
      term = x_4539.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}