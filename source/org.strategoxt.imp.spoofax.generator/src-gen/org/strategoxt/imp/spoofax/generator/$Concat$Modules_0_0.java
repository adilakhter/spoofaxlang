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

@SuppressWarnings("all") public class $Concat$Modules_0_0 extends Strategy 
{ 
  public static $Concat$Modules_0_0 instance = new $Concat$Modules_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ConcatModules_0_0");
    Fail25499:
    { 
      IStrategoTerm y_4225 = null;
      IStrategoTerm z_4225 = null;
      IStrategoTerm a_4226 = null;
      term = m_4226.instance.invoke(context, term);
      if(term == null)
        break Fail25499;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail25499;
      y_4225 = term.getSubterm(0);
      z_4225 = term.getSubterm(1);
      a_4226 = term.getSubterm(2);
      term = (IStrategoTerm)termFactory.makeListCons(generator.constappl4, termFactory.makeListCons(y_4225, (IStrategoList)generator.constNil7));
      term = concat_layout_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25499;
      term = termFactory.makeAppl(SpoofaxGenerator._consparsetree_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod7, (IStrategoTerm)termFactory.makeListCons(generator.constappl2, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod8, (IStrategoTerm)termFactory.makeListCons(generator.constappl5, termFactory.makeListCons(term, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod9, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consappl_2, new IStrategoTerm[]{generator.constprod10, (IStrategoTerm)termFactory.makeListCons(z_4225, (IStrategoList)generator.constNil7)}), (IStrategoList)generator.constNil7)}), (IStrategoList)generator.constNil7)))}), termFactory.makeListCons(a_4226, (IStrategoList)generator.constNil7)))}), generator.const6964});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}