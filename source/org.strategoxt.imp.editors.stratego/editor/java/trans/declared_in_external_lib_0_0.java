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

@SuppressWarnings("all") public class declared_in_external_lib_0_0 extends Strategy 
{ 
  public static declared_in_external_lib_0_0 instance = new declared_in_external_lib_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declared_in_external_lib_0_0");
    Fail21404:
    { 
      IStrategoTerm q_4194 = null;
      IStrategoTerm t_4194 = null;
      q_4194 = term;
      term = $Declaration_0_0.instance.invoke(context, q_4194);
      if(term == null)
        break Fail21404;
      term = get_constructor_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21404;
      t_4194 = term;
      term = string_starts_with_0_1.instance.invoke(context, t_4194, trans.const4319);
      if(term == null)
        break Fail21404;
      term = concat_strings_0_0.instance.invoke(context, trans.constCons2001);
      if(term == null)
        break Fail21404;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}