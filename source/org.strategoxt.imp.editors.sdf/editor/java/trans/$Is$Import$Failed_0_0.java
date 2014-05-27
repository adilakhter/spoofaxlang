package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Is$Import$Failed_0_0 extends Strategy 
{ 
  public static $Is$Import$Failed_0_0 instance = new $Is$Import$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImportFailed_0_0");
    Fail76240:
    { 
      TermReference b_92098 = new TermReference();
      TermReference c_92098 = new TermReference();
      IStrategoTerm f_92098 = null;
      IStrategoTerm h_92098 = null;
      IStrategoTerm i_92098 = null;
      if(c_92098.value == null)
        c_92098.value = term;
      else
        if(c_92098.value != term && !c_92098.value.match(term))
          break Fail76240;
      if(b_92098.value == null)
        b_92098.value = term;
      else
        if(b_92098.value != term && !b_92098.value.match(term))
          break Fail76240;
      h_92098 = term;
      f_92098 = trans.const15520;
      i_92098 = h_92098;
      term = dr_lookup_rule_0_2.instance.invoke(context, i_92098, f_92098, trans.constCons7205);
      if(term == null)
        break Fail76240;
      lifted21631 lifted216310 = new lifted21631();
      lifted216310.b_92098 = b_92098;
      lifted216310.c_92098 = c_92098;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted216310);
      if(term == null)
        break Fail76240;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}