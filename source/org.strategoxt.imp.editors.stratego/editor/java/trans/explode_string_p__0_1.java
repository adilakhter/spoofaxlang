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

@SuppressWarnings("all") public class explode_string_p__0_1 extends Strategy 
{ 
  public static explode_string_p__0_1 instance = new explode_string_p__0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_4765)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_4765 = new TermReference(ref_c_4765);
    context.push("explode_string_p__0_1");
    Fail23007:
    { 
      IStrategoTerm term12346 = term;
      Success12271:
      { 
        Fail23008:
        { 
          IStrategoTerm d_4765 = null;
          IStrategoTerm e_4765 = null;
          IStrategoTerm f_4765 = null;
          IStrategoTerm g_4765 = null;
          lifted6840 lifted68400 = new lifted6840();
          lifted68400.c_4765 = c_4765;
          term = split_at_1_0.instance.invoke(context, term, lifted68400);
          if(term == null)
            break Fail23008;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail23008;
          d_4765 = term.getSubterm(0);
          e_4765 = term.getSubterm(1);
          g_4765 = term;
          term = this.invoke(context, e_4765, c_4765.value);
          if(term == null)
            break Fail23008;
          f_4765 = term;
          term = g_4765;
          IStrategoList list196;
          list196 = checkListTail(f_4765);
          if(list196 == null)
            break Fail23008;
          term = (IStrategoTerm)termFactory.makeListCons(d_4765, list196);
          if(true)
            break Success12271;
        }
        term = term12346;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}