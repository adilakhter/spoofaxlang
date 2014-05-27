package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static $Is$Imported$Failed_0_0 instance = new $Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImportedFailed_0_0");
    Fail22207:
    { 
      TermReference a_4327 = new TermReference();
      TermReference b_4327 = new TermReference();
      IStrategoTerm f_4327 = null;
      if(b_4327.value == null)
        b_4327.value = term;
      else
        if(b_4327.value != term && !b_4327.value.match(term))
          break Fail22207;
      if(a_4327.value == null)
        a_4327.value = term;
      else
        if(a_4327.value != term && !a_4327.value.match(term))
          break Fail22207;
      f_4327 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, f_4327, trans.const4366, b_4327.value);
      if(term == null)
        break Fail22207;
      lifted6803 lifted68030 = new lifted6803();
      lifted68030.a_4327 = a_4327;
      lifted68030.b_4327 = b_4327;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68030);
      if(term == null)
        break Fail22207;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}