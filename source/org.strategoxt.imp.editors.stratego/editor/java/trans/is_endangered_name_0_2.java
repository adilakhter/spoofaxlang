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

@SuppressWarnings("all") public class is_endangered_name_0_2 extends Strategy 
{ 
  public static is_endangered_name_0_2 instance = new is_endangered_name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_4741, IStrategoTerm a_4742)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_endangered_name_0_2");
    Fail22855:
    { 
      IStrategoTerm b_4742 = null;
      b_4742 = term;
      term = strip_annos_0_0.instance.invoke(context, b_4742);
      if(term == null)
        break Fail22855;
      IStrategoTerm term12212 = term;
      Success12178:
      { 
        Fail22856:
        { 
          IStrategoTerm e_4742 = null;
          e_4742 = term;
          term = termFactory.annotateTerm(z_4741, checkListAnnos(termFactory, trans.constNil4));
          term = equal_0_1.instance.invoke(context, e_4742, term);
          if(term == null)
            break Fail22856;
          if(true)
            break Success12178;
        }
        term = term12212;
        IStrategoTerm g_4742 = null;
        g_4742 = term;
        term = termFactory.annotateTerm(a_4742, checkListAnnos(termFactory, trans.constNil4));
        term = equal_0_1.instance.invoke(context, g_4742, term);
        if(term == null)
          break Fail22855;
      }
      term = b_4742;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}