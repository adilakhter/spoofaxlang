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

@SuppressWarnings("all") public class declare_bodies_svar_0_0 extends Strategy 
{ 
  public static declare_bodies_svar_0_0 instance = new declare_bodies_svar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_bodies_svar_0_0");
    Fail21734:
    { 
      TermReference n_4253 = new TermReference();
      IStrategoTerm o_4253 = null;
      IStrategoTerm p_4253 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21734;
      IStrategoTerm arg7776 = term.getSubterm(0);
      if(arg7776.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7776).getConstructor())
        break Fail21734;
      o_4253 = arg7776.getSubterm(0);
      IStrategoTerm arg7777 = term.getSubterm(1);
      if(arg7777.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7777).isEmpty())
        break Fail21734;
      IStrategoTerm arg7778 = term.getSubterm(2);
      if(arg7778.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7778).isEmpty())
        break Fail21734;
      IStrategoTerm term11827 = term;
      Success11724:
      { 
        Fail21735:
        { 
          term = declare_cookie_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21735;
          term = termFactory.annotateTerm(o_4253, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          p_4253 = term;
          if(true)
            break Success11724;
        }
        term = term11827;
        term = signature_of_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21734;
        if(n_4253.value == null)
          n_4253.value = term;
        else
          if(n_4253.value != term && !n_4253.value.match(term))
            break Fail21734;
        term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21734;
        lifted6644 lifted66440 = new lifted6644();
        lifted66440.n_4253 = n_4253;
        term = fetch_elem_1_0.instance.invoke(context, term, lifted66440);
        if(term == null)
          break Fail21734;
        term = termFactory.annotateTerm(o_4253, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
        p_4253 = term;
      }
      term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{p_4253}), trans.constNil3, trans.constNil3});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}