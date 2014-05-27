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

@SuppressWarnings("all") public class opt2prodrule_0_0 extends Strategy 
{ 
  public static opt2prodrule_0_0 instance = new opt2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("opt2prodrule_0_0");
    Fail25631:
    { 
      IStrategoTerm term10149 = term;
      IStrategoConstructor cons333 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10115:
      { 
        if(cons333 == SpoofaxGenerator._consprod_3)
        { 
          Fail25632:
          { 
            IStrategoTerm g_4244 = null;
            IStrategoTerm h_4244 = null;
            IStrategoTerm i_4244 = null;
            IStrategoTerm arg6086 = term.getSubterm(0);
            if(arg6086.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6086).isEmpty())
              break Fail25632;
            IStrategoTerm arg6087 = ((IStrategoList)arg6086).head();
            if(arg6087.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6087).getConstructor())
              break Fail25632;
            g_4244 = arg6087.getSubterm(0);
            IStrategoTerm arg6088 = ((IStrategoList)arg6086).tail();
            if(arg6088.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6088).isEmpty())
              break Fail25632;
            IStrategoTerm arg6089 = term.getSubterm(1);
            i_4244 = arg6089;
            if(arg6089.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6089).getConstructor())
              break Fail25632;
            IStrategoTerm arg6090 = arg6089.getSubterm(0);
            if(arg6090.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6090).getConstructor())
              break Fail25632;
            if(arg6090.getSubterm(0) != g_4244 && !g_4244.match(arg6090.getSubterm(0)))
              break Fail25632;
            term = sym2tree_0_0.instance.invoke(context, g_4244);
            if(term == null)
              break Fail25632;
            h_4244 = term;
            term = get_nonterm_of_0_0.instance.invoke(context, i_4244);
            if(term == null)
              break Fail25632;
            term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{generator.constSomeTerm0, (IStrategoTerm)termFactory.makeListCons(h_4244, (IStrategoList)generator.constNil7)}), (IStrategoList)generator.constNil7)});
            if(true)
              break Success10115;
          }
          term = term10149;
        }
        if(cons333 == SpoofaxGenerator._consprod_3)
        { 
          IStrategoTerm d_4244 = null;
          IStrategoTerm arg6092 = term.getSubterm(0);
          if(arg6092.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6092).isEmpty())
            break Fail25631;
          IStrategoTerm arg6093 = term.getSubterm(1);
          if(arg6093.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6093).getConstructor())
            break Fail25631;
          IStrategoTerm arg6094 = arg6093.getSubterm(0);
          if(arg6094.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg6094).getConstructor())
            break Fail25631;
          d_4244 = arg6094.getSubterm(0);
          term = termFactory.makeAppl(SpoofaxGenerator._conscf_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consopt_1, new IStrategoTerm[]{d_4244})});
          term = get_nonterm_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25631;
          term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), generator.constCons4614});
        }
        else
        { 
          break Fail25631;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}